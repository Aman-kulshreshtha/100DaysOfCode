'use strict';
/* document.querySelector('.message').innerHTML = "This site is now hacked"; */
const inputField = document.querySelector('.guess');

const bodyElement = document.querySelector('body');
const res = document.querySelector('.message');
const checkBtn = document.querySelector('.check');
const againBtn = document.querySelector('.again');
const scoreField  =   document.querySelector('.score');
const highScoreField  =   document.querySelector('.highscore');
const result = document.querySelector('.number');


let number = Math.random() *(20-1) + 1;
number = Math.round(number);
let guess ;


let score = Number(scoreField.innerHTML);
let highscore =  Number(highScoreField.innerHTML);



checkBtn.addEventListener('click',() => {
   let guess = inputField.value;
   checkGuess(guess);
})

againBtn.addEventListener('click', () => {
        score =20;
        scoreField.innerHTML = score;
        inputField.value = '';
         number = Math.random() *(20-1) + 1;
         number = Math.round(number);
         res.innerHTML = 'Start guessing...';
         bodyElement.style.backgroundColor = '#222';
         result.innerHTML = '?';


}) ;

function checkGuess(guess) {
    if(guess < number ) {
        res.innerHTML = "Too low";
        score--;

    }else if (guess > number) {
        res.innerHTML = "Too High";
        score--;
    }else {
        bodyElement.style.backgroundColor = '#60B347';
        result.innerHTML = guess;
        res.innerHTML = "Correct !";
        if(highscore === 0) {
            highScoreField.innerHTML = score;
        }
        else {
            
            highscore =  Number(highScoreField.innerHTML);
            if(score > highScore) {

                 highScoreField.innerHTML = score;
            }
        }
       

    }

    scoreField.innerHTML = score;
}

