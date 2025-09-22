/*
JavaScript
Purpose: Adds interactivity and dynamic behavior to a web page.
In web design, JavaScript allows user interaction—such as responding
to button clicks, changing styles dynamically, and manipulating HTML content.
*/

// Array of colors to cycle through
const colors = ["lightblue", "lightgreen", "pink", "orange", "purple"];
let index = 0;

// Grab button and box elements
const button = document.getElementById("colorBtn");
const box = document.getElementById("box");

// Add event listener for button click
button.addEventListener("click", () => {
    index = (index + 1) % colors.length; // Move to next color
    box.style.backgroundColor = colors[index]; // Apply color to box
});
