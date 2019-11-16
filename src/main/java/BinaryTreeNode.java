import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
public class BinaryTreeNode<T extends Comparable<T>> implements Comparable<T> {

    private T payload;
    private BinaryTreeNode left;
    private BinaryTreeNode reight;

    /**
     * Constructor without parameters
     */
    public BinaryTreeNode() {
    }

    /**
     * Constructor with parameters
     * @param payload value of object
     * @param left lower item of BinaryTreeNode
     * @param reight higher item of BinaryTreeNode
     */
    public BinaryTreeNode(T payload, BinaryTreeNode left, BinaryTreeNode reight) {
        this.payload = payload;
        this.left = left;
        this.reight = reight;
    }

    /**
     * Compare object to this payload
     * @param object object to compare
     * @return compare-result
     */
    public int compareTo(@NotNull T object){
        return this.payload == null ? -1 : this.payload.compareTo(object);
    }

}
