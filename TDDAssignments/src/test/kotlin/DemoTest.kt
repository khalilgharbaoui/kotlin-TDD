import org.assertj.core.api.Assertions
import kotlin.test.Test
class DemoTest {
    @Test
    fun assertionSimpleDemo() {
        val myNumber = 4
        Assertions.assertThat(myNumber).isGreaterThan(2).isLessThan(5)
        val myStringList = listOf("A", "B", "C")
        Assertions.assertThat(myStringList).hasSize(3)
        Assertions.assertThat(myStringList).contains("A", "B")
        Assertions.assertThat(myStringList).isSorted
        Assertions.assertThat(myStringList).isNotEmpty
    }
}
class DemoTest2 {
    @Test
    fun assertionSimpleDemo() {
        val myNumber = 4
        Assertions.assertThat(myNumber).isGreaterThan(2).isLessThan(5)
        val myStringList = listOf("A", "B", "C")
        Assertions.assertThat(myStringList).hasSize(3)
        Assertions.assertThat(myStringList).contains("A", "B")
        Assertions.assertThat(myStringList).isSorted
        Assertions.assertThat(myStringList).isNotNull
    }
}



