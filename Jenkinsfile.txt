pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building for UAT environment..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing for UAT environment..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying for UAT environment....'
            }
        }
    }
}