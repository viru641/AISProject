pipeline {
    agent any
    stages {
        stage('Clean') 
        {
            steps 
            {
                bat "ant clean"
            }
        }
        stage('Build') 
        {
            steps 
            {
                bat "ant build"
            }
        }
        stage('Test') 
        {
            steps 
            {
                bat "ant TestFile"
            }
        }
        stage('Mutation_Testing') 
        {
            steps 
            {
                bat "ant pit"
            }
        }
        stage('Find_Bugs') 
        {
            steps 
            {
                bat "ant spotbugs"
            }
        }
    }
}
