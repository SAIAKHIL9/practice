pipeline {
  agent any
  stages {
    stage('Build and Compile') {
      parallel {
        stage('') {
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

    stage('unit tests') {
      steps {
        bat 'mvn test'
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
    Maven = 'maven_3.8.1'
  }
}