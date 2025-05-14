		function add() {
            let n1 = document.getElementById("num1").value;
            let n2 = document.getElementById("num2").value;
            let ADD = parseInt(n1) + parseInt(n2);
            document.getElementById("res").value ="Addition : "+ADD;
        }
        function sub() {
            let n1 = document.getElementById("num1").value;
            let n2 = document.getElementById("num2").value;
            let SUB = parseInt(n1) - parseInt(n2);
            document.getElementById("res").value ="Subtraction : "+SUB;
        }
        function mul() {
            let n1 = document.getElementById("num1").value;
            let n2 = document.getElementById("num2").value;
            let MUL = parseInt(n1) * parseInt(n2);
            document.getElementById("res").value ="Multiplication : "+MUL;
        }
        function div() {
            let n1 = document.getElementById("num1").value;
            let n2 = document.getElementById("num2").value;
            if(n2==0)
            {
				document.getElementById("res").value ="Cannot Divided By Zero!!";
			}
			else
			{
            let DIV = parseInt(n1) / parseInt(n2);
            document.getElementById("res").value ="Division : "+DIV;
            }
        }/***/