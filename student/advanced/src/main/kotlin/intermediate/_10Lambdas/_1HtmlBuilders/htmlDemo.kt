package intermediate._10Lambdas._1HtmlBuilders

import javax.swing.*
import javax.swing.SwingConstants.*

fun main(args: Array<String>) {
    with(JFrame("Product popularity")) {
        setSize(600, 600)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        add(JScrollPane(JLabel(renderProductTable(), CENTER)))
        isVisible = true
    }
}

