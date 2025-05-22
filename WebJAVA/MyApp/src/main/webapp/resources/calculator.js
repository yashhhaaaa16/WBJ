    function add() {
        let n1 = parseFloat(document.getElementById("num1").value);
        let n2 = parseFloat(document.getElementById("num2").value);
        document.getElementById("res").value = "Addition : "+(n1 + n2);
    }

    function sub() {
        let n1 = parseFloat(document.getElementById("num1").value);
        let n2 = parseFloat(document.getElementById("num2").value);
        document.getElementById("res").value = "Subtraction : "+(n1 - n2);
    }

    function mul() {
        let n1 = parseFloat(document.getElementById("num1").value);
        let n2 = parseFloat(document.getElementById("num2").value);
        document.getElementById("res").value = "Multiplication : "+(n1 * n2);
    }

    function div() {
        let n1 = parseFloat(document.getElementById("num1").value);
        let n2 = parseFloat(document.getElementById("num2").value);
        if (n2 !== 0) {
            document.getElementById("res").value ="Division : "+ n1 / n2;
        } else {
            document.getElementById("res").value = "Cannot divide by zero!";
        }
    }