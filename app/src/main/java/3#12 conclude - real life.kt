/*
Imagine you are creating a forum for coders in a programming community.
In that forum, the user can create a post. For instance,
they may talk in their post about their code or projects.
Other coders in that forum can choose a comment to add to that post.
In addition, the users can choose a relationship type.
This indicates the relationship between one user and another.
These are relationship types such as ‘work colleague’, ‘friend’ or being a member of the
same sports team. Finally, you will include the ability for the author of a post to block
other users from commenting on the post.

Note: In this exercise, we work with an example that only has one post.
It is posted by the current user (post owner). If this were a full real-world application,
we would also create a relationship between comments, post owner, or even build a Post class.
But for this exercise, you don’t need to do any of that.

When all the code is built your output will look something like this:

This is a summary of your tasks in this exercise:

Store and display comments

Store the user’s relationship to other users

Filter out comments of blocked users


Tip: The map will store the relationships between users.
The list will be used to store all the comments.
A set is used to store the blocked users.

 */

class Comment(
    val id: Int,
    val message: String
)

fun main(){
    val comments: List<Comment> = listOf(
        Comment(5241, "Nice code"),
        Comment(6624, "Like it"),
        Comment(5224, "What’s going on?"),
        Comment(9001, "Check out my website"),
        Comment(8818, "Hello everyone :)")
    )

    val blockUserIds:Set<Int> = setOf(5241, 9001)
    val userIdToRelation: Map<Int, String> = mapOf(
        Pair(5241, "Friend"),
        Pair(6624, "Work Collogue")
    )

    for(i in comments){
        if(i.id !in blockUserIds){
            val relation = userIdToRelation[i.id] ?: "unknown"

            println("Comment: ${i.message} from $relation")
        }
    }


}