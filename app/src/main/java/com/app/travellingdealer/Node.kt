package com.app.travellingdealer

class Node(var data: Int) {

    var following: Node? = null

    fun appendToEnd(x:Int,y:Int) {
        val end = Node(data)
        var n: Node? = this
        while (n!!.following != null) {
            n = n.following
        }
        n.following = end
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    // For example:: --> 5 --> 6 --> 7 --> 3 --> .
    fun printNodes() {}

    // TODO:: Implement to return the length of the SinglyLinkedList
    fun length(h: Node?): Int {
        return 0
    }

    // TODO:: Implement to return the sum of the Nodes
    fun sumOfNodes(): Int {
        return 0
    }

    fun deleteNode(head: Node, data: Int): Node? {
        val n: Node = head

        if(n.data == data) {
            return head.following
        }
        // TODO:: Implement the proper loop in order to remove given data

        //
        return head
    }
    fun calculateDistance(x:Int,y:Int):Int{
       val firstVal=(x-3)

     return 0
    }
}


