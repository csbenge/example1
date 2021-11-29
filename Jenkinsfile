pipeline {
    agent any
    stages {
       stage('build') {
          steps {
             echo '***** BUILD *****'
             echo 'javac Example.java'
          }
       }
       stage('test') {
           steps {
               echo '***** TEST *****'
               echo 'java Example'
           }
       }
    }
 }
