package lotto

import camp.nextstep.edu.missionutils.test.Assertions.assertRandomUniqueNumbersInRangeTest
import camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest
import camp.nextstep.edu.missionutils.test.NsTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ApplicationTest : NsTest() {

    @Test
    fun `exception test`() {
        assertSimpleTest {
            runException("1000j")
            assertThat(output()).contains(ERROR_MESSAGE)
        }
    }

    @Test
    fun `test invalid purchase amount - less than minimum`() {
        assertSimpleTest {
            runException("900")
            assertThat(output()).contains("[ERROR] The purchase amount must be 1000 or higher")
        }
    }

    override fun runMain() {
        main()
    }

    companion object {
        private const val ERROR_MESSAGE: String = "[ERROR]"
    }
}
