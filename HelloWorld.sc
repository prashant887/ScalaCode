def add(args:Int*):Int={

  var sum=0
  for(i <- args){
    sum+=i
  }
  return  sum;
}

println(add(1,2,3,4,5))
