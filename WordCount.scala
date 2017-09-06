package spark

object WordCount {
  def main(args: Array[String]): Unit = {

    /**
      * 1、创建Spark的配置对象SparkConf,设置Spark程序的运行时的配置信息
      * 通过setMaster来设置程序要连接的Spark集群的Master的URL，若设置为local：代表本地运行
      */
    val conf = new SparkConf() //创建SparkConf对象
  }
}
