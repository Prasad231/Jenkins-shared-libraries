def call(String imagename, String imagetag){
  echo "Building a code using docker"
  sh "docker build -t ${imagename}:${imagetag} ."
  echo "Building a code using docker completed."
}
