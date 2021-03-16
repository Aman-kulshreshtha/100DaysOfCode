'use strict';


process.stdin.resume();
process.stdin.setEncoding("utf-8");
let stdin_input = "";

process.stdin.on("data", input => {
    stdin_input += input;
});


process.stdin.on("end", () => {
    main(stdin_input);
});

function main(input) {
    console.log(your name is )
}

