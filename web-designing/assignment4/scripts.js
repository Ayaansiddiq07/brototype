
        function show(){
        console.log("Button clicked")
        var a=10;
        var a=20;
        console.log(a);
        let b=30;
        //let b=40;  // it will give error
        b=40;
        console.log(b);
        const c=50;
        // c=60;   // it will give error
        //const c will work differently from let the difference is that const value cannot be changed but let value can be changed but cannot be redeclared.
        console.log(c);
        console.log("End of function")
        }
        function multiplication(){
            for(var i=1;i<=10;i++){
                let result=5*i;
                console.log("5 x "+i+" = "+result);
            }
        }
        function display(){
            var text =document.getElementById("inputText").value;
            var result=parseInt(text) + parseInt(text);
            document.getElementById("display_id").innerHTML=result;
            window.alert("Text displayed successfully!"+text);
        }   
        function createobject(){
            var person=[
                {
                name:"Ayaan",
                age:18,
                city:"kerala"
            },
            {
                
                name:"Sajid",
                age:19,
                city:"kerala"
            }];
            text ="Enter the choice which person detailes you want to see: 0 for Ayaan and 1 for Sajid";
            var choice=window.prompt(text);
            var person=person[choice];
            //choice 0 for Ayaan and 1 for Sajid logic
            document.getElementById("display_id").innerHTML="Name: "+person.name+"<br>"+"Age: "+person.age+"<br>"+"City: "+person.city;
             window.alert("Details displayed successfully!");
             //logic for if a user want to access name seprate or city seprate or age seprate using switch case
             choice=window.prompt("Enter 0 for name, 1 for age, 2 for city case 3 for to show all details");
             switch(choice){
                case '0':
                    document.getElementById("display_id").innerHTML="Name: "+person.name;
                    break;
                case '1':
                    document.getElementById("display_id").innerHTML="Age: "+person.age;
                    break;
                case '2':
                    document.getElementById("display_id").innerHTML="City: "+person.city;
                    break;
                case '3':
                    document.getElementById("display_id").innerHTML="Name: "+person.name+"<br>"+"Age: "+person.age+"<br>"+"City: "+person.city;
                    break;
                default:
                    document.getElementById("display_id").innerHTML="Invalid choice";
                    break;
             }
             

        }