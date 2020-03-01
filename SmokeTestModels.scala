import org.apache.log4j.{Logger,Level}
import org.apache.spark.sql.{SparkSession}
object SmokeTestModels {

  def main(args: Array[String]): Unit = {
    Logger.getLogger("org").setLevel(Level.ERROR)

    val spark=SparkSession.builder().appName("SmokeTestModels").master("local[*]").getOrCreate()
    import spark.implicits._

    val SmokeTestDataFrame=spark.read.format("csv").load("D:\\visrepsmoketestmodel.csv")
        .toDF("SmokeModels").as("SmokeMdl")

    //SmokeTestDataFrame.show(truncate = false)

    val OpsBldDF=spark.read.format("csv").load("D:\\activemdpmodels.csv")
        .toDF("OpsModel").as("opsmdl")

   // OpsBldDF.show(truncate = false)

    OpsBldDF
      .join(SmokeTestDataFrame,$"SmokeMdl.SmokeModels"===$"opsmdl.OpsModel","left_anti")
        .show(1000,truncate = false)
    spark.stop()
  }
}
