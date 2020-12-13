package com.app.travellingdealer

class Node(var x:Int, var y:Int) {


    var following: Node? = null
    var head: Node? = null
    fun appendToEnd(x:Int,y:Int) {

        val end = Node(x,y)
        var n: Node? = this
        if(head == null) head = Node(x,y)
        else {
            while (n!!.following != null) {
                n = n.following
            }
            n.following = end
        }
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    // For example:: --> 5 --> 6 --> 7 --> 3 --> .
    fun printNodes() {
        var cur = head
        while(cur != null) {
            print("${cur.x},${cur.y} ")
            cur = cur?.following
        }
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    fun length(h: Node?): Int {
        var result=0
        var cur = h
        while(cur != null) {
            cur = cur?.following
            result++
        }
        return result
    }

    // TODO:: Implement to return the sum of the Nodes
    fun sumOfNodes(): Int {
        var result=0
        var cur = head
        while(cur != null) {
            result+=calculateDistance(cur.x,cur.y)
            cur = cur?.following
        }
        return result
    }

    fun deleteNode(head: Node, x: Int, y: Int): Node? {
        val n: Node = head

        if(n.x==x && n.y==y) {
            return head.following
        }
        // TODO:: Implement the proper loop in order to remove given data
           while(!(n.x==x && n.y==y)){
              
           }
        //
        return head
    }
    fun calculateDistance(x:Int,y:Int):Int{
       var firstVal=Math.pow(x-3.toDouble(),2.0)
        var secondVal=Math.pow(y-7.toDouble(),2.0)


     return Math.sqrt(firstVal+secondVal).toInt()
    }
}


