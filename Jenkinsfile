pipeline {
    agent any
    environment {
       THIS_VERSION = '1.3.0'
    }
    parameters {
       choice(name: 'THIS_VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'])
       booleanParam(name: 'runTests', defaultValue: true, description: '')
    }
    stages {
       stage('build') {
          steps {
             echo '***** BUILD *****'
             echo 'Building Main Application...'
             echo "*** VERSION: ${THIS_VERSION}"
             sh 'cd src;javac example/java/Example.java'
             echo 'Building Test Application...'
             sh 'cd src;javac test/java/ExampleTest.java'
          }
       }
       stage('test') {
            when {
               expression {
                  params.runTests == true
               }
            }
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

    post {
       always {
            echo 'Do this always'
       }
       success {
            echo 'Do this on success'
       }
       failure {
            echo 'Do this on failure'
       }
    }
 }
