const currentEl = document.getElementById('current');
const previousEl = document.getElementById('previous');
const buttons = document.querySelector('.buttons');

let current = '0';
let previous = '';
let operator = null;
let shouldResetCurrent = false;

function updateDisplay() {
  currentEl.textContent = current;
  previousEl.textContent = previous ? `${previous} ${operator || ''}` : '';
}

function appendNumber(digit) {
  if (shouldResetCurrent) {
    current = digit;
    shouldResetCurrent = false;
    return;
  }
  current = (current === '0') ? digit : (current + digit);
}

function appendDot() {
  if (shouldResetCurrent) {
    current = '0.';
    shouldResetCurrent = false;
    return;
  }
  if (!current.includes('.')) current += '.';
}

function chooseOperator(op) {
  if (operator && !shouldResetCurrent) calculate();
  operator = op;
  previous = current;
  shouldResetCurrent = true;
}

function calculate() {
  if (!operator || previous === '') return;
  const a = parseFloat(previous);
  const b = parseFloat(current);
  if (Number.isNaN(a) || Number.isNaN(b)) return;

  let result;
  switch (operator) {
    case '+': result = a + b; break;
    case '-': result = a - b; break;
    case '*': result = a * b; break;
    case '/': result = (b === 0) ? 'Error' : a / b; break;
    default: return;
  }

  if (result === 'Error') {
    current = 'Error';
  } else {

    result = Math.round((result + Number.EPSILON) * 1e10) / 1e10;
    current = String(result);
  }

  previous = '';
  operator = null;
  shouldResetCurrent = true;
}

function clearAll() {
  current = '0';
  previous = '';
  operator = null;
  shouldResetCurrent = false;
}

function deleteLast() {
  if (shouldResetCurrent) {
    current = '0';
    shouldResetCurrent = false;
    return;
  }
  current = current.length > 1 ? current.slice(0, -1) : '0';
}


buttons.addEventListener('click', (e) => {
  const btn = e.target.closest('button');
  if (!btn) return;

  if (btn.classList.contains('button_number')) {
    appendNumber(btn.textContent.trim());
  } else if (btn.classList.contains('button_dot')) {
    appendDot();
  } else if (btn.classList.contains('button_operator')) {
    chooseOperator(btn.getAttribute('data-action'));
  } else if (btn.classList.contains('button_equals')) {
    calculate();
  } else if (btn.classList.contains('button_clear')) {
    clearAll();
  } else if (btn.classList.contains('button_delete')) {
    deleteLast();
  }

  updateDisplay();
});


window.addEventListener('keydown', (e) => {
  if (e.key >= '0' && e.key <= '9') appendNumber(e.key);
  else if (e.key === '.') appendDot();
  else if (['+','-','*','/'].includes(e.key)) chooseOperator(e.key);
  else if (e.key === 'Enter' || e.key === '=') { calculate(); e.preventDefault(); }
  else if (e.key === 'Backspace') deleteLast();
  else if (e.key.toLowerCase() === 'c') clearAll();

  updateDisplay();
});


updateDisplay();