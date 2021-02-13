def call (){
pipeline {
    agent any

    stages { 
    stage('Terraform Init') {
            steps {
    sh '''cd dev
    terraform init'''
        
            }
        }
        
     stage('Terraform Apply') {
            steps {
    sh '''cd dev
    terraform apply -auto-approve'''
           
                
                }
            }
        }
    }
}