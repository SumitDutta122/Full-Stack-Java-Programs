//  const now = 2037;
//  const ageJonas =  now - 1991;
//  const ageSarah = now - 2018;

//  comsole.log(now - 1991 > now -2018);

//  let x; y;
//  x = y = 25 - 10 - 5;  
//  console.log(x, y);

const firstName = 'Jonas';
const job = 'teacher';
const birthYear = 1991;
const year = 2023;

 const jonas = "I'm "  + firstName + ', a ' + (year - birthYear) + 'years old' + job + '!';
 console.log(jonas);     // instead of writing this we can use template literals.
                          // template literals can assemble multiple piece of code into one final string.

// how template literals is used, using $ symbol inside ``
const jonasNew = `I'm ${firstName} a ${year - birthYear} years Old ${job} !`     ;  //this is how temlates literals can be used.
console.log(jonasNew);

console.log(`just a regular string...`);
// using backticks `` in every string is a good approach to use it because you 
// dont have to think about quatations '' "" .

// in order to print string on another line you should be using \n\
console.log('String with \n\
multiple \n\
lines');


// this is the right way using multi line string. not the above one.
console.log(`String 
multiple
lines`);