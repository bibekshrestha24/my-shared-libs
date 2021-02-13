def call (){
pipeline {
    agent any

    stages { 
    stage('Terraform Init') {
            steps {
    sh '''cd test
    terraform init'''
        
            }
        }
        
     stage('Terraform Apply') {
            steps {
    sh '''cd test
    terraform apply -auto-approve'''
           
                
                }
            }
        }
    }
}