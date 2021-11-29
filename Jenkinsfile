pipeline {
    agent any
    stages {
       stage('build') {
          steps {
             echo 'BUILD'
             updateGitlabCommitStatus name: 'build', state: 'pending'
             echo 'javac Example.java'
             updateGitlabCommitStatus name: 'build', state: 'success'
          }
       }
       stage('test') {
           steps {
               echo 'TEST'
               updateGitlabCommitStatus name: 'test', state: 'pending'
               echo 'java Example'
               updateGitlabCommitStatus name: 'test', state: 'success'

           }
       }
    }
 }
