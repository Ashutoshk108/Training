function getDescription(){

    return alert("flower, the characteristic reproductive structure of angiosperms. As popularly used, the term “flower” especially applies when part or all of the reproductive structure is distinctive in colour and form.");

}

$(document).ready(function(){
    $("button").click(function(){
        var x=getEmi();
        document.getElementById("emi").innerText=x;
    })
})

function getEmi(){
    price=500000;
    rate= 12;
    months=24;

    interest = (price * (rate * 0.01))/months;

    total = Math.round(((price/months) + interest));

    return alert("Emi amount: "+total);

}