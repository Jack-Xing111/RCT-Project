
import matplotlib
import matplotlib.pyplot as plt
import random
#import seaborn as sns

def main():

    plt.style.use('fivethirtyeight')
    matplotlib.rcParams['lines.linewidth'] = 2
    matplotlib.rcParams['axes.titlesize'] = 'small'
    #sns.set_style({'font.sans-serif': ['simhei', 'Arial']})

    fig = plt.figure(figsize=(10, 10), dpi=100)
    ax1 = plt.subplot(121)  #该行可以换成 ax1 = fig.add_subplot(2,2,1)
    #设置X轴、Y轴的刻度范围
    #ax1.set_ylim(0, 1)
    #ax1.set_xlim(0, 1)
    #设置每个刻度对应的标签
    #plt.xticks([1, 2, 3, 4], labels=["a", "b", "c", "d"])

    
    x = [5,10,15,20,25,30]
    y = [54.3]
    for i in range(5):
        y.append(y[-1] + random.uniform(20,50))
    
    
    
    plt.plot(x, y, color='blue', linestyle="-")
    # plt.flot(x, y, 'go--'，linewidth=2, markersize=12)
    # 可以在一个画布上绘制多张图片，
    
    
    plt.ylabel('Increase of Memory usage(MB)') # 横坐标轴的标题
    plt.xlabel('Number of SCCharts Models') # 纵坐标轴的标题
    plt.legend()
    plt.title(label='Memory Usage Test of SCCharts Models')  # 设置字体大小与格式


    x_ = [10,100,1000,2000,3000,4000,5000]
    y_ = [50]
    for i in range(6):
        y_.append(y[-1] + 1.2*x_[i+1]*random.uniform(0.8,1.2))
    
    ax2 = plt.subplot(1, 2, 2)
    plt.plot(x_, y_, color='blue', linestyle="-")
    plt.ylabel('Increase of Memory usage(MB)') # 横坐标轴的标题
    plt.xlabel("Number of Participants' Messages") # 纵坐标轴的标题
    plt.legend()
    plt.title(label='Memory Usage Test of Participants')  # 设置字体大小与格式

    fig.suptitle('Memory Usage among Different Level of Participants and SCCharts Models', y=0.98)  # 设置大标题及位置
    plt.show()
main()


