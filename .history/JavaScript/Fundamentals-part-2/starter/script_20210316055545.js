'use strict';
/* console.log("Hello"); */


let avg = (val1,val2,val3) =>(val1 + val2 + val3)/3 ;

let checkWinner = function(avgDolphins,avgKoalas) {
    if(avgDolphins >= 2* avgKoalas) {
        console.log(`Dolphins win (${avgDolphins} vs ${avgKoalas})`);

    }else if(2*avgDolphins <=  avgKoalas) {
        console.log(`Koalas win (${avgKoalas} vs ${avgDolphins})`);
    }else {
        console.log(`it's a draw !`);
    }

}

checkWinner(avg(44,23,71),avg(65,54,49));

