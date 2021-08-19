pipeline {
  agent any
  stages {
    stage('build and compile') {
      parallel {
        stage('build and compile') {
          steps {
            git(url: 'https://github.com/SAIAKHIL9/practice.git', branch: 'jen', credentialsId: '3bb6ff0e-ed61-4295-b136-12ba3c69e2e8')
            tool(name: 'maven', type: 'maven_3.8.2')
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
}