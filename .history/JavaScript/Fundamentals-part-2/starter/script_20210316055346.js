'use strict';
/* console.log("Hello"); */


let avg = (val1,val2,val3) =>(val1 + val2 + val3)/3 ;

let checkWinner = function(avgDolphins,avgKoalas) {
    if(avgDolphins >= 2* avgKoalas) {
        console.log(`Dolphins win (${avgDolphins} vs ${avgKoalas})`);

    }elseif(avgDolphins <=  avgKoalas) {
        console.log(`Koalas win (${avgDolphins} vs ${avgKoalas})`);

    }
}
