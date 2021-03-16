'use strict';


process.stdin.resume();
process.stdin.setEncoding("utf-8");
let stdin_input = "";

process.stdin.on("data", function(input) {
    stdin_input += input;
});


process.stdin.on("end", function() {
    main(stdin_input);
});

