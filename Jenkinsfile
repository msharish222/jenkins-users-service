pipeline {
    agent any
  stages {
        
        
        stage('clean'){
            steps{
                sh 'mvn clean'
            }
        }
           stage('compile'){
            steps{
                sh 'mvn compile'
            }
        }
        
       /* stage('quality'){
        steps{
        sh 'mvn sonar:sonar'
        }
        
        }*/
        
        
        stage('test'){
        steps{
        sh 'mvn test'
        }
        
        }
           stage('jar'){
               steps{
                   sh 'mvn package -DskipTests=true'
               }
           }
        }
    }
