pipeline {
  agent any
  stages {
    stage('build and compile') {
      parallel {
        stage('error') {
          steps {
            git(url: 'https://github.com/SAIAKHIL9/practice.git', branch: 'jen', credentialsId: '3bb6ff0e-ed61-4295-b136-12ba3c69e2e8')
          }
        }

        stage('compile') {
          steps {
            bat 'mvn compile'
          }
        }

      }
    }

    stage('Unit tests') {
      steps {
        bat 'mvn -Dtest=HelloWorldTest#test test -p1 core'
      }
    }

    stage('package') {
      steps {
        bat 'mvn package'
      }
    }

    stage('Results') {
      steps {
        junit '**/*.xml'
      }
    }

  }
  environment {
    maven = 'maven_3.8.1'
  }
}