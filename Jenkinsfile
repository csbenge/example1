pipeline {
    agent any
    stages {
       stage('build') {
          steps {
             echo '***** BUILD *****'
             echo 'javac example/java/Example.java'
             sh 'ls -F'
             sh 'java example.java.Example'
          }
       }
       stage('test') {
           steps {
               echo '***** TEST *****'
               echo 'javac test/java/ExampleTest.java'
               sh 'java test.java.ExampleTest'
           }
       }
       stage('deploy') {
           steps {
               echo '***** DEPLOY *****'
               echo 'cp Example.class'
               sh 'java example.java.Example'
           }
       }
    }
 }
