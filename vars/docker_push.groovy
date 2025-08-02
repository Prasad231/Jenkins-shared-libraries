def call(String DOCKER_USERNAME, String imagename, String imagetag  ){
  echo "Push built image to DockerHub"
  withCredentials([usernamePassword(credentialsId: "Docker_Hub_Cred",usernameVariable: "DOCKER_USERNAME", passwordVariable: "DOCKER_PASSWORD")]){
  sh "docker login -u ${env.DOCKER_USERNAME} -p ${env.DOCKER_PASSWORD}"
  sh "docker image tag notesapp:latest ${env.DOCKER_USERNAME}/notesapp:latest"  
  sh "docker push ${env.DOCKER_USERNAME}/${imagename}:${imagetag}"  
  echo "Pushing built image to DockerHub competed "
}
}
