def call(String dockerimage, String imagetag){
  echo "Building a code using docker"
  sh "docker build -t ${dockerimage}:${imagetag} ."
  echo "Building a code using docker completed."
}
