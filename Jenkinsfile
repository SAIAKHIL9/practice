pipeline {
  agent any
  stages {
    stage('Build and compile') {
      parallel {
        stage('build') {
          environment {
            maven = 'maven_3.8.2'
          }
          steps {
            git(url: 'https://github.com/SAIAKHIL9/practice.git', branch: 'jen', credentialsId: '3bb6ff0e-ed61-4295-b136-12ba3c69e2e8')
          }
        }

        stage('compile') {
          steps {
            withMaven(maven: 'maven_3.8.2') {
              bat 'mvn compile'
            }

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
}