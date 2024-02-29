# Assessement Details

This repo is used for java&selenium assessment.

## Installation
Java compiler used for this project is 16. Run the following command in the terminal:

```bash
brew install --cask adoptopenjdk/openjdk/adoptopenjdk16
```

Install project dependencies using below command:

```bash
mvn clean install
```

## Assessment details

1. Pull the latest changes if you already cloned it. You will implement locally the practice exercises mentioned in the assessment file.

2. Create your branch: 

   Create a new branch before making changes. The new branch should follow [fullName]_branch naming convention (eg. ralucaElenaAlecu_branch)

3. Practice 1:

   Resolve Java exercises inside src/main/java/org/example/Main.java. Exercises should run without error and have the functionality mentioned in each exercise. Name the methods using exercise[number] naming convention, eg. exercise1().

4. Practice 2:

   Create the scenario in the feature file: Go to src/test/resources directory in the cloned repository. Here, you should have the .feature files without the scenario written in Gherkin syntax. Create Gerkin scenario for createAccount.feature as per requirement.

5. Practice 3:

   Implement the steps. Now, for each step in your .feature files, you need to provide the step definitions. Go to the src/test/java/stepDefinition/stepsDefinition.java and create the step implementation here. These step definitions will contain the actual Selenium commands to interact with the application.

6. Push your work: 

    After implementing the scenarios and their corresponding step definitions, commit your changes and push your branch to the repository. Push the changes at the time mentioned in the Assessment details file.
