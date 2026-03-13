// Brute Force TC: O(N) SC: O(N)
class Solution {
    public Node connect(Node root) {
        Queue<Node> curr=new LinkedList<>();
        if(root==null){
            return root;
        }
        Queue<Node> next=new LinkedList<>();
        ArrayList<Node> list=new ArrayList<>();
        curr.add(root);
        while(!curr.isEmpty()){
            Node c=curr.poll();
            list.add(c);
            if(c.left!=null){
                next.add(c.left);
            }
            if(c.right!=null){
                next.add(c.right);
            }
            if(curr.isEmpty()){
                int index=0;
                while(index<list.size()){
                    if((index+1)==list.size()){
                        Node t=list.get(index);
                        t.next=null;
                    }
                    else{
                        Node t=list.get(index);
                        Node h=list.get(index+1);
                        t.next=h;
                    }
                    index++;
                }
                list=new ArrayList<>();
                curr=next;
                next=new LinkedList<>();
            }
        }
        return root;
    }
}
// Optimised approach TC: O(N) SC: O(1)
class Solution {
    public Node connect(Node root) {
         if(root == null) return null;

        Node leftMost = root;

        while(leftMost.left != null){
            Node curr = leftMost;

            while(curr != null){
                curr.left.next = curr.right;

                if(curr.next != null){
                    curr.right.next = curr.next.left;
                }

                curr = curr.next;
            }

            leftMost = leftMost.left;
        }

        return root;
    }
}
