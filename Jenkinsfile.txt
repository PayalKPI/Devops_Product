pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building for DEV environment..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing for DEV environment..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying for DEV environment....'
            }
        }
    }
}