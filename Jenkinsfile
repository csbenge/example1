pipeline {
    agent any
    stages {
       stage('build') {
          steps {
             echo '***** BUILD *****'
             echo 'javac Example.java'
             sh 'javac Example.java'
          }
       }
       stage('test') {
           steps {
               echo '***** TEST *****'
               echo 'java Example'
               sh 'java Example'
           }
       }
       stage('deploy') {
           steps {
               echo '***** DEPLOY *****'
               echo 'cp Example.class'
           }
       }
    }
 }
