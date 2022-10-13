pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building for SIT environment..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing for SIT environment..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying for SIT environment....'
            }
        }
    }
}