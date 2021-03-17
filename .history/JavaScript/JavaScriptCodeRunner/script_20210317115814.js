'use strict'
/* 
Objects in javaScript */

/* Functional Objects */

function Node(data) {
    this.data = data;
    this.next= null;    
    this.add = add;  
    this.printLinkedList = print ;

}

function add(data) {
    this.next = new Node(data);
}

function print() {
    let ptr = this;
    while(ptr !== null) {
        console.log(ptr.data);
        ptr = ptr.next;

    }

}


let list = new Node(5);
list.add(4);
list.add(3);
list.add(2);
list.add(1);
list.add(4);





