package com.frank.esay;

/**
 * 对称二叉树
 *
 * 分析：
 * 1) A 的根节点和 B 的根节点是否相等
 * 2) A 的左子树和 B 的右子树是否相等，同时 A 的右子树和左子树是否相等。
 *
 * 满足上面2点，为对称二叉树
 */
public class SymmetricBinaryTree {

    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        return isSymmetricHelper(root.left, root.right);
    }

    private boolean isSymmetricHelper(TreeNode left, TreeNode right) {
        // 有且仅有一个为null，直接返回false
        if(left == null && right != null || left != null && right == null) {
            return false;
        }

        // 当两者都不为空的时候，进入判断
        if(left != null && right != null) {
            // 1) A节点和B节点是否相等
            if(left.val != right.val) {
                return false;
            }

            // 2) A 的左子树和 B 的右子树是否相等，同时 A 的右子树和左子树是否相等。(递归迭代左右树信息）
            return isSymmetricHelper(left.left, right.right) && isSymmetricHelper(left.right, right.left);
        }

        return true;
    }
}
