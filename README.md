“Working with the list and saving the state”
Setting the task
You need to develop a small application that displays rectangles with numbers in several columns. For portrait orientation, it is required to display rectangles (or cards) in 3 columns, for horizontal orientation, it is required to display rectangles in 4 columns. The displayed number is the index of the element (you can count from either 0 or 1). Even elements should have a red background, odd ones should have a blue background.
There should be a button under the list (if an actionButton is used, then it can be located at the bottom of the list), tapping on which adds a new rectangle to the list. The button (even the Action Button) should not overlap the rectangles!
Flipping the screen should not knock down the number of rectangles. If the application was knocked out of memory in the background, then when restoring this application, it is necessary to restore the number of rectangles.
Limitations and requirements
It is required to use Fragment
