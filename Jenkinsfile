pipeline {
    agent any
    tools {
        maven 'maven_3.8.1'
    }
    stages {
        stage('Build') {
            steps {
                git branch: 'jen', credentialsId: '3bb6ff0e-ed61-4295-b136-12ba3c69e2e8', url: 'https://github.com/SAIAKHIL9/practice.git'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
                }
        }
        stage('Package') {
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
