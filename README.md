Al Ahly Momken Task

in this task we used a Page Object Model Design Pattern so there are two Main Directory Java and Test
- in Java we will find a BasePage class which contains all the common method which all the other pages will inheret
- also we will find a class to each page and this class divided to parts the first part related to the locators then the second part related to the getters, third part
  related to clicks on the elements, forth part related to send keys to the elements, fifth part is related to the functions which we will use in this specific page

- test Directory also contain BasePage which contain the before and after method which are responible for set up and tear down the browser and the website
- also we will find a class for each page contains the test cases which are related to this page and in this class we just use the functions which we already implement
  in the Java Directory
