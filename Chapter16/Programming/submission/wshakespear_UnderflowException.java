//package weiss.nonstandard;

/**
 * Exception class for access in empty containers
 * such as stacks, queues, and priority queues.
 * @author Mark Allen Weiss
 */
public class wshakespear_UnderflowException extends RuntimeException
{
    /**
     * Construct this exception object.
     * @param message the error message.
     */
    public wshakespear_UnderflowException( String message )
    {
        super( message );
    }
}
