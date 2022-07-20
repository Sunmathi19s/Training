// function itsMe(){

//     console.log("Hi");
// }

var myobj={}

myobj.itsMe = function(){
    console.log("Hi");
}

myobj.author='gagu';

var ourObj={
    designer : 'Using Js Obj',
    showDesigner:function(){
        console.log(this.designer)
    }
}

var Employee = function(employeeId,employeeName){
    this.employeeId = employeeId;
    this.employeeName = employeeName;
}

var Tom = new Employee(101,'Tom')

function setContent(){
    var element = document.getElementById("author");
element.innerHTML=myobj.author;

var title = document.getElementById("heading");
title.innerHTML=ourO
bj.designer;
}