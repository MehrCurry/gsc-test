@Grapes(
        @Grab(group = 'com.atlassian.jgitflow', module = 'jgit-flow', version = '0.10')
)
import com.atlassian.jgitflow.core.*

@Grapes(
        @Grab(group = 'com.atlassian.jgitflow', module = 'jgit-flow', version = '0.10')
)
import java.lang.Object

//get or initialize an instance using the default branch names / prefixes
JGitFlow flow = JGitFlow.getOrInit(new File("."))

//start a feature with a fetch
flow.featureStart("my-feature").setFetchDevelop(true).call()

println "Success"