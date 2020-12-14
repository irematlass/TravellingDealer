package com.app.travellingdealer

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Example
        val node = Node(1,4)
        node.appendToEnd(6,5)
        node.appendToEnd(6,2)
        node.appendToEnd(8,9)
        node.printNodes()
        Log.d("dealerLenght",node.length(node).toString())
        Log.d("dealerSum",node.sumOfNodes().toString())
        node.deleteNode(node,6,5)
        node.printNodes()

    }
}