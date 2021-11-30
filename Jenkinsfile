pipeline {
    agent any
    stages {
       stage('build') {
          steps {
             echo '***** BUILD *****'
             echo 'Building Main Application...'
             sh 'cd src;javac example/java/Example.java'
             echo 'Building Test Application...'
             sh 'cd src;javac test/java/ExampleTest.java'
          }
       }
       stage('test') {
           steps {
               echo '***** TEST *****'
               echo 'Testing squareIt()...'
               sh 'cd src;java test.java.ExampleTest'
           }
       }
       stage('deploy') {
           steps {
               echo '***** DEPLOY *****'
               echo 'Deploying Example.class'
               sh 'cd src;java example.java.Example'
           }
       }
    }
 }
