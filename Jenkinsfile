pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/sivaakamall14/LibraryApp.git'
            }
        }

        stage('Build Java') {
            steps {
                bat 'javac src/*.java'
            }
        }

        stage('Run App') {
            steps {
                bat 'java -cp src Main'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t libraryapp .'
            }
        }

        stage('Docker Run') {
            steps {
                bat 'docker run libraryapp'
            }
        }
    }
}